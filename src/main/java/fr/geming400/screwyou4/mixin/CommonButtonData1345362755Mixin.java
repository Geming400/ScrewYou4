package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dialog.CommonButtonData.class)
public class CommonButtonData1345362755Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_436736487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(436736487L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2115786280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2115786280L))
            info.setReturnValue("XA+(Gr\u36D0,M\"Zrlz=`,7Lf(a.iDs/Fp\u4981@fW{hy\u3BEC#");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1902714846(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1902714846L))
            info.setReturnValue(385727034);
    }

    @Inject(at = @At("HEAD"), method = "width()I", cancellable = true)
    private void width__294785245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-294785245L))
            info.setReturnValue(-1426324983);
    }

    @Inject(at = @At("HEAD"), method = "label()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void label_1957636554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1957636554L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tooltip()Ljava/util/Optional;", cancellable = true)
    private void tooltip_889111540(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(889111540L))
            info.setReturnValue(null);
    }


}
