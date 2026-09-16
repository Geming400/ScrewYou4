package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.KilledByArrowTrigger.TriggerInstance.class)
public class TriggerInstance_1807596438Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_898970169(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(898970169L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1716947334(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1716947334L))
            info.setReturnValue("$FVC\uD54C,Q(1HSjnF;^CP\u0839\u887F?\u87F3>]_,R3Iw\uCC1DUgbzOK;.VLS\uACECXveck*J5\u4549#T*\u2FC7#Bcp)0Ac[\uAFC0\u52FDrp1_XfU\"e");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1930018768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1930018768L))
            info.setReturnValue(321111352);
    }

    @Inject(at = @At("HEAD"), method = "matches(Ljava/util/Collection;ILnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void matches_1337341836(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1337341836L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContextSource;)V", cancellable = true)
    private void validate_2067769543(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2067769543L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player_576943396(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(576943396L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "firedFromWeapon()Ljava/util/Optional;", cancellable = true)
    private void firedFromWeapon_1856064311(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1856064311L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "victims()Ljava/util/List;", cancellable = true)
    private void victims__1483761360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1483761360L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "uniqueEntityTypes()Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private void uniqueEntityTypes_2119032318(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2119032318L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "crossbowKilled(Lnet/minecraft/core/HolderGetter;[Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void crossbowKilled__544463071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-544463071L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "crossbowKilled(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void crossbowKilled__822554478(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-822554478L))
            info.setReturnValue(null);
    }


}
