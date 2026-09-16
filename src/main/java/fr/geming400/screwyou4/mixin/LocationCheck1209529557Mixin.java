package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.predicates.LocationCheck.class)
public class LocationCheck1209529557Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_300903289(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(300903289L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1979953082(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1979953082L))
            info.setReturnValue("<vBLE_\u0488&U\u8BCFxQ_\u294D\u792C\uA464jv\u67C9?Me:(Q>T\uBE84I\uD797X3\"=y\u6954");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1766881648(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1766881648L))
            info.setReturnValue(1122601667);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__527442154(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-527442154L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void test__196082919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-196082919L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "offset()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void offset_415228963(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(415228963L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "predicate()Ljava/util/Optional;", cancellable = true)
    private void predicate_1438391098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1438391098L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getReferencedContextParams()Ljava/util/Set;", cancellable = true)
    private void getReferencedContextParams_1989032785(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1989032785L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__2018992485(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2018992485L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "checkLocation(Lnet/minecraft/advancements/predicates/LocationPredicate$Builder;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition$Builder;", cancellable = true)
    private static void checkLocation__1914042140(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1914042140L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "checkLocation(Lnet/minecraft/advancements/predicates/LocationPredicate$Builder;)Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition$Builder;", cancellable = true)
    private static void checkLocation_1634531868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1634531868L))
            info.setReturnValue(null);
    }


}
