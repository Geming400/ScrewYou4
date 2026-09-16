package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition.class)
public class LootItemRandomChanceCondition275772651Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__632853617(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-632853617L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1046196176(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1046196176L))
            info.setReturnValue("FfY");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_833124742(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(833124742L))
            info.setReturnValue(-944315447);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__1461199060(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1461199060L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void test__1129839825(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1129839825L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1342217905(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1342217905L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chance()Lnet/minecraft/world/level/storage/loot/providers/number/NumberProvider;", cancellable = true)
    private void chance_385012593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(385012593L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "randomChance(F)Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition$Builder;", cancellable = true)
    private static void randomChance_618912729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(618912729L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "randomChance(Lnet/minecraft/world/level/storage/loot/providers/number/NumberProvider;)Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition$Builder;", cancellable = true)
    private static void randomChance_264355496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(264355496L))
            info.setReturnValue(null);
    }


}
