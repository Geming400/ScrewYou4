package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.numbers.StyledFormat.class)
public class StyledFormat75043164Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/chat/numbers/NumberFormatType;", cancellable = true)
    private void type__1683512257(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1683512257L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1460555423(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1460555423L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1060416811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1060416811L))
            info.setReturnValue("03'3\"v],4Lv'x&io_湔n$㌋\"6\"v㍑$-U[?gMc늼j$=tK:s闸}狶jV@D0greDp낼/OF1{[;7Be벬KqE3Kkmrꍲ], I\"{Q");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_113305906(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(113305906L))
            info.setReturnValue(912666101);
    }

    @Inject(at = @At("HEAD"), method = "format(I)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void format_674276832(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(674276832L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "style()Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void style__234563525(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-234563525L))
            info.setReturnValue(null);
    }


}
