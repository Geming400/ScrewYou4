package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.LockCode.class)
public class LockCode1795614582Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_886988314(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(886988314L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1728929189(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1728929189L))
            info.setReturnValue("zPw{@\u4C31[cdyP3-");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1942000623(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1942000623L))
            info.setReturnValue(-1912349659);
    }

    @Inject(at = @At("HEAD"), method = "predicate()Lnet/minecraft/advancements/predicates/ItemPredicate;", cancellable = true)
    private void predicate__1871407638(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1871407638L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromTag(Lnet/minecraft/world/level/storage/ValueInput;)Lnet/minecraft/world/LockCode;", cancellable = true)
    private static void fromTag__907181987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-907181987L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addToTag(Lnet/minecraft/world/level/storage/ValueOutput;)V", cancellable = true)
    private void addToTag_524469148(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(524469148L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUnlock(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void canUnlock__728417804(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-728417804L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "unlocksWith(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void unlocksWith__1293464611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1293464611L))
            info.setReturnValue(false);
    }


}
