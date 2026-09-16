package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.BeeNestDestroyedTrigger.TriggerInstance.class)
public class TriggerInstance1288839692Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_380213424(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(380213424L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2059263217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2059263217L))
            info.setReturnValue("bdi\uB334iU>\u48DCoX\u1CC6y5\u1710 &\"U.[\uFE40O\uC36Eh^|\u565B\u4AD14|_8\u9D83uUqhzR#L.I\u13E30\u2B6EFT^.\uADE2UO-*tqn-AX!L-$\u380Fvt+dx:>+sf");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1846191783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1846191783L))
            info.setReturnValue(1470560623);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/item/ItemStack;I)Z", cancellable = true)
    private void matches__342120549(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-342120549L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "block()Ljava/util/Optional;", cancellable = true)
    private void block__1785085625(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1785085625L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "item()Ljava/util/Optional;", cancellable = true)
    private void item_490325453(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(490325453L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "beesInside()Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private void beesInside__742577235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-742577235L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "destroyedBeeNest(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/advancements/predicates/ItemPredicate$Builder;Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void destroyedBeeNest__1153085770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1153085770L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player_58186651(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(58186651L))
            info.setReturnValue(null);
    }


}
