package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.RotatingSectionStorage.class)
public class RotatingSectionStorage1793555458Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size__2057680249(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2057680249L))
            info.setReturnValue(2011605445);
    }

    @Inject(at = @At("HEAD"), method = "getValue(J)Lnet/minecraft/client/RotatingSectionStorage$Value;", cancellable = true)
    private void getValue_883193904(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(883193904L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getValue(III)Lnet/minecraft/client/RotatingSectionStorage$Value;", cancellable = true)
    private void getValue_1204501775(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1204501775L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "iterator()Ljava/util/Iterator;", cancellable = true)
    private void iterator__867333040(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-867333040L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spliterator()Ljava/util/Spliterator;", cancellable = true)
    private void spliterator__1774565044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1774565044L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forEach(Ljava/util/function/Consumer;)V", cancellable = true)
    private void forEach_1310045257(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1310045257L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "minY()I", cancellable = true)
    private void minY_2088419841(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2088419841L))
            info.setReturnValue(328172578);
    }

    @Inject(at = @At("HEAD"), method = "maxY()I", cancellable = true)
    private void maxY_1315941267(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1315941267L))
            info.setReturnValue(-741092338);
    }

    @Inject(at = @At("HEAD"), method = "height()I", cancellable = true)
    private void height_708206881(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(708206881L))
            info.setReturnValue(1891984021);
    }

    @Inject(at = @At("HEAD"), method = "repositionCenter(Lnet/minecraft/core/SectionPos;)Z", cancellable = true)
    private void repositionCenter_2003227446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2003227446L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "centerSectionPos()Lnet/minecraft/core/SectionPos;", cancellable = true)
    private void centerSectionPos_181057591(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(181057591L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getValueAt(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/client/RotatingSectionStorage$Value;", cancellable = true)
    private void getValueAt_559745821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(559745821L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "radius()I", cancellable = true)
    private void radius__1033375594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1033375594L))
            info.setReturnValue(1227628846);
    }


}
