package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dialog.input.SingleOptionInput.class)
public class SingleOptionInput_2024745937Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__884709101(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-884709101L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_889285961(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(889285961L))
            info.setReturnValue("`qsBsgL\uCF65^Q_5\uCD5B\uB4FCa<KM,\u3F54o6+t(\u6C92\u8587NH<8\u3855\u51E4P\u6BFCFx4|3sg&.zu4a\u89CCXP@\uA820*$2%mnA\u9C3C_4=");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2063008678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2063008678L))
            info.setReturnValue(396115545);
    }

    @Inject(at = @At("HEAD"), method = "entries()Ljava/util/List;", cancellable = true)
    private void entries__643884544(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-643884544L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "width()I", cancellable = true)
    private void width_2063008182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2063008182L))
            info.setReturnValue(599262964);
    }

    @Inject(at = @At("HEAD"), method = "label()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void label__152163229(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-152163229L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "initial()Ljava/util/Optional;", cancellable = true)
    private void initial__2024759938(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2024759938L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mapCodec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void mapCodec__534367636(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-534367636L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "labelVisible()Z", cancellable = true)
    private void labelVisible_2063024519(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2063024519L))
            info.setReturnValue(true);
    }


}
