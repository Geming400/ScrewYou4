package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.LockCode.class)
public class LockCode1795614582Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1113840455(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1113840455L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_660154607(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(660154607L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1833877324(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1833877324L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "predicate()Lnet/minecraft/advancements/predicates/ItemPredicate;", cancellable = true)
    private void predicate_530290625(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(530290625L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addToTag(Lnet/minecraft/world/level/storage/ValueOutput;)V", cancellable = true)
    private void addToTag_576483230(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(576483230L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUnlock(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void canUnlock__1558747224(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1558747224L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromTag(Lnet/minecraft/world/level/storage/ValueInput;)Lnet/minecraft/world/LockCode;", cancellable = true)
    private static void fromTag_1616906445(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1616906445L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unlocksWith(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void unlocksWith__764817582(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-764817582L))
            info.setReturnValue(null);
    }


}
