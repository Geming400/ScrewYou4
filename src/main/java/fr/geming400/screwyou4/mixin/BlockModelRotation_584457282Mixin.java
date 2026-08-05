package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.dispatch.BlockModelRotation.class)
public class BlockModelRotation_584457282Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lcom/mojang/math/OctahedralGroup;)Lnet/minecraft/client/renderer/block/dispatch/BlockModelRotation;", cancellable = true)
    private static void get__145465517(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-145465517L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__551003190(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-551003190L))
            info.setReturnValue("/I|\uA6D9: \u7D57F\u890B3<c[\u92846HE\uB0D8teVs\u04FBU\u75502\u5C62oyk5jWnV[rpU`X\u8773VC\u1DA4Z\u93CDE\u733FJ77");
    }

    @Inject(at = @At("HEAD"), method = "transformation()Lcom/mojang/math/Transformation;", cancellable = true)
    private void transformation_1362441710(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1362441710L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withUvLock()Lnet/minecraft/client/renderer/block/dispatch/ModelState;", cancellable = true)
    private void withUvLock_1308690726(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1308690726L))
            info.setReturnValue(null);
    }


}
