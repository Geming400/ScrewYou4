package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.UsedTotemTrigger.TriggerInstance.class)
public class TriggerInstance_1927057157Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1018430888(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1018430888L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1597486615(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1597486615L))
            info.setReturnValue("'$0SF0nUdOB\uCFC87\u8FD9<");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1810558049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1810558049L))
            info.setReturnValue(-1877040779);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void matches__998726899(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-998726899L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "item()Ljava/util/Optional;", cancellable = true)
    private void item_1128542917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1128542917L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "usedTotem(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/world/level/ItemLike;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void usedTotem__374783140(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-374783140L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "usedTotem(Lnet/minecraft/advancements/predicates/ItemPredicate;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void usedTotem__826685683(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-826685683L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player_696404115(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(696404115L))
            info.setReturnValue(null);
    }


}
