package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.PlayerTrigger.TriggerInstance.class)
public class TriggerInstance_1062307286Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_153681017(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(153681017L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1832730810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1832730810L))
            info.setReturnValue("\uAF6BZDw*y_u=,\u156FUo[\u89E1:k?Xh:D.qnGzMg/r\u8834\uB2D8\u86F8x4\uBF15,1t\u24D7.");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1619659376(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1619659376L))
            info.setReturnValue(-1200975340);
    }

    @Inject(at = @At("HEAD"), method = "tick()Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void tick__1040832385(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1040832385L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sleptInBed()Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void sleptInBed__1798599952(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1798599952L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "raidWon()Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void raidWon__50347760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-50347760L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "located(Ljava/util/Optional;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void located_1717985945(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1717985945L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "located(Lnet/minecraft/advancements/predicates/LocationPredicate$Builder;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void located_1856611095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1856611095L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "located(Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void located_23037903(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(23037903L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "avoidVibration()Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void avoidVibration__479662721(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-479662721L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "walkOnBlockWithEquipment(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/item/Item;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void walkOnBlockWithEquipment_1069442474(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1069442474L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player__168345756(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-168345756L))
            info.setReturnValue(null);
    }


}
