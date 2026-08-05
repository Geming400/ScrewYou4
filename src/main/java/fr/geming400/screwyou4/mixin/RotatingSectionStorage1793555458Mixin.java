package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.RotatingSectionStorage.class)
public class RotatingSectionStorage1793555458Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_1831817704(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1831817704L))
            info.setReturnValue(1382137926);
    }

    @Inject(at = @At("HEAD"), method = "getValue(J)Lnet/minecraft/client/RotatingSectionStorage$Value;", cancellable = true)
    private void getValue__464999051(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-464999051L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getValue(III)Lnet/minecraft/client/RotatingSectionStorage$Value;", cancellable = true)
    private void getValue__1623771884(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1623771884L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "iterator()Ljava/util/Iterator;", cancellable = true)
    private void iterator__358060574(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-358060574L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spliterator()Ljava/util/Spliterator;", cancellable = true)
    private void spliterator__1409975671(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1409975671L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forEach(Ljava/util/function/Consumer;)V", cancellable = true)
    private void forEach__1820395425(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1820395425L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getValueAt(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/client/RotatingSectionStorage$Value;", cancellable = true)
    private void getValueAt__1457458993(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1457458993L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxY()I", cancellable = true)
    private void maxY_1831817704(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1831817704L))
            info.setReturnValue(1382137926);
    }

    @Inject(at = @At("HEAD"), method = "minY()I", cancellable = true)
    private void minY_1831817704(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1831817704L))
            info.setReturnValue(1382137926);
    }

    @Inject(at = @At("HEAD"), method = "height()I", cancellable = true)
    private void height_1831817704(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1831817704L))
            info.setReturnValue(1382137926);
    }

    @Inject(at = @At("HEAD"), method = "repositionCenter(Lnet/minecraft/core/SectionPos;)Z", cancellable = true)
    private void repositionCenter_704765925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(704765925L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "centerSectionPos()Lnet/minecraft/core/SectionPos;", cancellable = true)
    private void centerSectionPos__1592907237(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1592907237L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "radius()I", cancellable = true)
    private void radius_1831817704(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1831817704L))
            info.setReturnValue(1382137926);
    }


}
