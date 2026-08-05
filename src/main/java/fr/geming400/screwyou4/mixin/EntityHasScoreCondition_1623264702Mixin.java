package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.predicates.EntityHasScoreCondition.class)
public class EntityHasScoreCondition_1623264702Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1286190336(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1286190336L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_487804726(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(487804726L))
            info.setReturnValue("J/MM,9b⩧㼎膌厦4࿈2<`3>-c|hGRsjv6uao嗫niNya}0#nX]M&`f75>$V(QL@g;u!l怹i%N>㖵JUI$vn.f2V");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1661527443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1661527443L))
            info.setReturnValue(363610583);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void test__753684397(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-753684397L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__1286061872(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1286061872L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate__1095071904(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1095071904L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "entityTarget()Lnet/minecraft/world/level/storage/loot/LootContext$EntityTarget;", cancellable = true)
    private void entityTarget_1113260505(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1113260505L))
            info.setReturnValue(net.minecraft.world.level.storage.loot.LootContext.EntityTarget.THIS);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__935848871(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-935848871L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasScores(Lnet/minecraft/world/level/storage/loot/LootContext$EntityTarget;)Lnet/minecraft/world/level/storage/loot/predicates/EntityHasScoreCondition$Builder;", cancellable = true)
    private static void hasScores__2064005363(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2064005363L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "scores()Ljava/util/Map;", cancellable = true)
    private void scores__381358939(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-381358939L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getReferencedContextParams()Ljava/util/Set;", cancellable = true)
    private void getReferencedContextParams__205770785(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-205770785L))
            info.setReturnValue(null);
    }


}
