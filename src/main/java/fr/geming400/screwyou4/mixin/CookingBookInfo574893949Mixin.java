package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.AbstractCookingRecipe.CookingBookInfo.class)
public class CookingBookInfo574893949Mixin {
        @Inject(at = @At("HEAD"), method = "group()Ljava/lang/String;", cancellable = true)
    private void group__560566522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-560566522L))
            info.setReturnValue("89\u79C6=U*q\u09A8HAFCl(sV]1\u8A6B799*[n\uCF82l>\u9196bAL*y+4-8xVRZ'\u2178D(Bp\u8272,o]n\u566E/jdZO-OBa\u7C49\uB163\u4830 =tFK,}i");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1960406208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1960406208L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__560566026(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-560566026L))
            info.setReturnValue("Uy\u1380[Qo\u04493}<h=kFSu0`\u7FE8jmpoSv?1\"i*\uC388mSO h-Lq G\"3;q\u9C4A\u8F9BhQlAL\uB598!\uD5ECT7c#wA5B`702m|b{\u5252\u6588c");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_613156691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(613156691L))
            info.setReturnValue(-840932851);
    }

    @Inject(at = @At("HEAD"), method = "category()Ljava/lang/Object;", cancellable = true)
    private void category__1860752168(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1860752168L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "category()Lnet/minecraft/world/item/crafting/CookingBookCategory;", cancellable = true)
    private void category__1580791870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1580791870L))
            info.setReturnValue(net.minecraft.world.item.crafting.CookingBookCategory.BLOCKS);
    }


}
