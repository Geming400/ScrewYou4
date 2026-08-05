package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.FilledBucketTrigger.TriggerInstance.class)
public class TriggerInstance1581677823Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1327777214(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1327777214L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_446217848(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(446217848L))
            info.setReturnValue("}e_r\u4995\"Tm\u88D4{h-X=\uFE91^sp<],TXRnKacGOB6\u179D/");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1619940565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1619940565L))
            info.setReturnValue(-99481297);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void matches__978754341(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-978754341L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "item()Ljava/util/Optional;", cancellable = true)
    private void item_1827139245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1827139245L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player_1827139245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1827139245L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "filledBucket(Lnet/minecraft/advancements/predicates/ItemPredicate$Builder;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void filledBucket__127275059(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-127275059L))
            info.setReturnValue(null);
    }


}
