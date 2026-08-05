package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.ClickEvent.OpenFile.class)
public class OpenFile_1410674142Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_502047873(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(502047873L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2113869630(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2113869630L))
            info.setReturnValue("v=E6A\"{*H`y^f\uD10FgFc\u0313\u4554{F\uA7BCg\u5E6C[\uBE87g']\uCE3ElTwJa\u5B0A/$<OSA863Yedg!'Z\u1D623^ ?LUM\uB6B6\u2370:=5y[\u7EEA'_[:]{1BV6qH-b;CJ;?s");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1968026232(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1968026232L))
            info.setReturnValue(-169110869);
    }

    @Inject(at = @At("HEAD"), method = "file()Ljava/io/File;", cancellable = true)
    private void file_1189139087(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1189139087L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "action()Lnet/minecraft/network/chat/ClickEvent$Action;", cancellable = true)
    private void action_1496803323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1496803323L))
            info.setReturnValue(net.minecraft.network.chat.ClickEvent.Action.OPEN_URL);
    }

    @Inject(at = @At("HEAD"), method = "path()Ljava/lang/String;", cancellable = true)
    private void path_1252259787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1252259787L))
            info.setReturnValue("\uD34BIOgnkJ\u15C5jk6Q7Q\u248A3bNN{axHx(`\"SqPc\uA694/HlD[MM/x");
    }


}
