package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.SimpleModelWrapper.class)
public class SimpleModelWrapper_1926752036Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__982703002(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-982703002L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_791292060(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(791292060L))
            info.setReturnValue("f*?\u5E02tB\uC017\uB287-Os|=A+-Ov\u5E19z`!&U`g\u78FDXB\u153Eya/&?I*qz9TP!RDC!");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1965014777(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1965014777L))
            info.setReturnValue(1993185033);
    }

    @Inject(at = @At("HEAD"), method = "findNonBlockSprites(Lnet/minecraft/client/resources/model/geometry/QuadCollection;)Lcom/google/common/collect/Multimap;", cancellable = true)
    private static void findNonBlockSprites__1806939752(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1806939752L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/resources/model/ModelBaker;Lnet/minecraft/resources/Identifier;Lnet/minecraft/client/renderer/block/dispatch/ModelState;)Lnet/minecraft/client/renderer/block/dispatch/BlockStateModelPart;", cancellable = true)
    private static void bake__1086339841(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1086339841L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "quads()Lnet/minecraft/client/resources/model/geometry/QuadCollection;", cancellable = true)
    private void quads_235915055(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(235915055L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getQuads(Lnet/minecraft/core/Direction;)Ljava/util/List;", cancellable = true)
    private void getQuads_435861959(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(435861959L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "useAmbientOcclusion()Z", cancellable = true)
    private void useAmbientOcclusion_1965030618(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1965030618L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "materialFlags()I", cancellable = true)
    private void materialFlags_1965014281(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1965014281L))
            info.setReturnValue(-2024763055);
    }

    @Inject(at = @At("HEAD"), method = "particleMaterial()Lnet/minecraft/client/resources/model/sprite/Material$Baked;", cancellable = true)
    private void particleMaterial__273298727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-273298727L))
            info.setReturnValue(null);
    }


}
