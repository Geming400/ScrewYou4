package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.ArmorModelSet.class)
public class ArmorModelSet1004951770Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/entity/EquipmentSlot;)Ljava/lang/Object;", cancellable = true)
    private void get__1750060147(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1750060147L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_96325502(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(96325502L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1775375295(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1775375295L))
            info.setReturnValue("_Zju");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1562303861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1562303861L))
            info.setReturnValue(-527979754);
    }

    @Inject(at = @At("HEAD"), method = "map(Ljava/util/function/Function;)Lnet/minecraft/client/renderer/entity/ArmorModelSet;", cancellable = true)
    private void map_1362881916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1362881916L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "head()Ljava/lang/Object;", cancellable = true)
    private void head_168199253(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(168199253L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/entity/ArmorModelSet;Lnet/minecraft/client/model/geom/EntityModelSet;Ljava/util/function/Function;)Lnet/minecraft/client/renderer/entity/ArmorModelSet;", cancellable = true)
    private static void bake_1785618868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1785618868L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chest()Ljava/lang/Object;", cancellable = true)
    private void chest__1886019914(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1886019914L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "feet()Ljava/lang/Object;", cancellable = true)
    private void feet__1720472157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1720472157L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "legs()Ljava/lang/Object;", cancellable = true)
    private void legs_1381835994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1381835994L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "putFrom(Lnet/minecraft/client/renderer/entity/ArmorModelSet;Lcom/google/common/collect/ImmutableMap$Builder;)V", cancellable = true)
    private void putFrom_975591736(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(975591736L))
            info.cancel();
    }


}
