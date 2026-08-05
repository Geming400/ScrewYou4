package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.KilledByArrowTrigger.TriggerInstance.class)
public class TriggerInstance_1807596438Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1101858600(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1101858600L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_672136462(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(672136462L))
            info.setReturnValue("W⿴鰵昣櫢wᥔfBp<1nbM ᰛ4WU'z*L;bBW!D>U3q&2.禞8&$9=a/嬝d]z`(G﹣j'uAM,u3&)k唔");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1845859179(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1845859179L))
            info.setReturnValue(682117842);
    }

    @Inject(at = @At("HEAD"), method = "matches(Ljava/util/Collection;ILnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void matches_423282265(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(423282265L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContextSource;)V", cancellable = true)
    private void validate__332344291(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-332344291L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player_2053057859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2053057859L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "victims()Ljava/util/List;", cancellable = true)
    private void victims__861034043(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-861034043L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "firedFromWeapon()Ljava/util/Optional;", cancellable = true)
    private void firedFromWeapon_2053057859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2053057859L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "crossbowKilled(Lnet/minecraft/core/HolderGetter;[Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void crossbowKilled_154741288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(154741288L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "crossbowKilled(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void crossbowKilled__246768679(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-246768679L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "uniqueEntityTypes()Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private void uniqueEntityTypes_1656361379(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1656361379L))
            info.setReturnValue(null);
    }


}
