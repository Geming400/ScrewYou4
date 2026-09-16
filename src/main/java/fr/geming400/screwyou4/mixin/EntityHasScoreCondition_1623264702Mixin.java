package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.predicates.EntityHasScoreCondition.class)
public class EntityHasScoreCondition_1623264702Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_714638433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(714638433L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1901279070(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1901279070L))
            info.setReturnValue("]y#>\u30EEl");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2114350504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2114350504L))
            info.setReturnValue(-1781586102);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void test_217652225(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(217652225L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__113707010(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-113707010L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate_604545930(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(604545930L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1605257341(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1605257341L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasScores(Lnet/minecraft/world/level/storage/loot/LootContext$EntityTarget;)Lnet/minecraft/world/level/storage/loot/predicates/EntityHasScoreCondition$Builder;", cancellable = true)
    private static void hasScores_134524264(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(134524264L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityTarget()Lnet/minecraft/world/level/storage/loot/LootContext$EntityTarget;", cancellable = true)
    private void entityTarget__1163916539(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1163916539L))
            info.setReturnValue(net.minecraft.world.level.storage.loot.LootContext.EntityTarget.THIS);
    }

    @Inject(at = @At("HEAD"), method = "scores()Ljava/util/Map;", cancellable = true)
    private void scores__659784988(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-659784988L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getReferencedContextParams()Ljava/util/Set;", cancellable = true)
    private void getReferencedContextParams__1892199367(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1892199367L))
            info.setReturnValue(null);
    }


}
