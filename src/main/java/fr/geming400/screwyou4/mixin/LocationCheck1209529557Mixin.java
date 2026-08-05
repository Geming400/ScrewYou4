package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.predicates.LocationCheck.class)
public class LocationCheck1209529557Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1699925480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1699925480L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_74069582(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(74069582L))
            info.setReturnValue("fV;j");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1247792299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1247792299L))
            info.setReturnValue(1779389971);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__1699797016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1699797016L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void test__1167419541(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1167419541L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "offset()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void offset__683857322(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-683857322L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "predicate()Ljava/util/Optional;", cancellable = true)
    private void predicate_1454990979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1454990979L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1349584015(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1349584015L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getReferencedContextParams()Ljava/util/Set;", cancellable = true)
    private void getReferencedContextParams__619505929(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-619505929L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "checkLocation(Lnet/minecraft/advancements/predicates/LocationPredicate$Builder;)Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition$Builder;", cancellable = true)
    private static void checkLocation__913766785(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-913766785L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "checkLocation(Lnet/minecraft/advancements/predicates/LocationPredicate$Builder;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition$Builder;", cancellable = true)
    private static void checkLocation_1176492897(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1176492897L))
            info.setReturnValue(null);
    }


}
