package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.BeeNestDestroyedTrigger.TriggerInstance.class)
public class TriggerInstance1288839692Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1620615345(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1620615345L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_153379717(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(153379717L))
            info.setReturnValue("I쏆Nm뿟阦&v뼀|T|,Rnb4aV04_F7_猶0Z`㼛}펀ΊfN7q/>te-KpTR2&N#lX(뛩@9ƍ━g뼡%X");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1327102434(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1327102434L))
            info.setReturnValue(-302561040);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/item/ItemStack;I)Z", cancellable = true)
    private void matches_1826173160(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1826173160L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "block()Ljava/util/Optional;", cancellable = true)
    private void block_1534301114(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1534301114L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "item()Ljava/util/Optional;", cancellable = true)
    private void item_1534301114(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1534301114L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player_1534301114(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1534301114L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "destroyedBeeNest(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/advancements/predicates/ItemPredicate$Builder;Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void destroyedBeeNest_97336085(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(97336085L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "beesInside()Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private void beesInside_1137604634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1137604634L))
            info.setReturnValue(null);
    }


}
