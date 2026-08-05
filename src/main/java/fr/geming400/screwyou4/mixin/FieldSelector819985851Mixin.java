package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.visitors.FieldSelector.class)
public class FieldSelector819985851Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name__315474620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-315474620L))
            info.setReturnValue("81$Y;h%s\u069ETP\u7BE4\"s(V\u5ABC,\u5D78=I3wez\u79A3ivS\uD2B78vL{:EJ2thtQ`\u80ACoSw#e\u8D4D.$XC-Y\u5949DAKL\u85CAB'f\u51362qr4a5");
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/nbt/TagType;", cancellable = true)
    private void type__2058355890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2058355890L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2089469186(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2089469186L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__315474124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-315474124L))
            info.setReturnValue("x]3>mmP#@0\uCB159c.M<Nv\uAAC0@vPl*[9YG");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_858248593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(858248593L))
            info.setReturnValue(-395974679);
    }

    @Inject(at = @At("HEAD"), method = "path()Ljava/util/List;", cancellable = true)
    private void path__1848644629(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1848644629L))
            info.setReturnValue(null);
    }


}
