package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.dispatch.BlockModelRotation.class)
public class BlockModelRotation_584457282Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lcom/mojang/math/OctahedralGroup;)Lnet/minecraft/client/renderer/block/dispatch/BlockModelRotation;", cancellable = true)
    private static void get_1126436393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1126436393L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1354880310(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1354880310L))
            info.setReturnValue(")|.Z$}\u55B6Aw>\u22AD[\u1238V\uCDCA^qFHO\u1DA3Yx\"UXUC.xfX<6j\u84C1Ly\u142Ejz{GX T*Z.`m+//k?jD*yKf.`c?gBZ9-A{>w`ac.\u8A59tLZyxCe(\u0218!-\u9456l;m^p");
    }

    @Inject(at = @At("HEAD"), method = "transformation()Lcom/mojang/math/Transformation;", cancellable = true)
    private void transformation__2068629385(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2068629385L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withUvLock()Lnet/minecraft/client/renderer/block/dispatch/ModelState;", cancellable = true)
    private void withUvLock_295991956(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(295991956L))
            info.setReturnValue(null);
    }


}
