package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.SimpleModelWrapper.class)
public class SimpleModelWrapper_1926752036Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1018125767(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1018125767L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1597791736(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1597791736L))
            info.setReturnValue("0z!I%f\"2`\uA30EsX'\u1D44KCV<B`@qa\u9C20\u764A(`ArQd:zxaacY#");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1810863170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1810863170L))
            info.setReturnValue(-706679001);
    }

    @Inject(at = @At("HEAD"), method = "findNonBlockSprites(Lnet/minecraft/client/resources/model/geometry/QuadCollection;)Lcom/google/common/collect/Multimap;", cancellable = true)
    private static void findNonBlockSprites__109678771(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-109678771L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "materialFlags()I", cancellable = true)
    private void materialFlags_1186269033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1186269033L))
            info.setReturnValue(-497752114);
    }

    @Inject(at = @At("HEAD"), method = "useAmbientOcclusion()Z", cancellable = true)
    private void useAmbientOcclusion__280334114(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-280334114L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "particleMaterial()Lnet/minecraft/client/resources/model/sprite/Material$Baked;", cancellable = true)
    private void particleMaterial_453981350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(453981350L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/resources/model/ModelBaker;Lnet/minecraft/resources/Identifier;Lnet/minecraft/client/renderer/block/dispatch/ModelState;)Lnet/minecraft/client/renderer/block/dispatch/BlockStateModelPart;", cancellable = true)
    private static void bake_1659604056(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1659604056L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "quads()Lnet/minecraft/client/resources/model/geometry/QuadCollection;", cancellable = true)
    private void quads__1783718853(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1783718853L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getQuads(Lnet/minecraft/core/Direction;)Ljava/util/List;", cancellable = true)
    private void getQuads__218372451(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-218372451L))
            info.setReturnValue(null);
    }


}
