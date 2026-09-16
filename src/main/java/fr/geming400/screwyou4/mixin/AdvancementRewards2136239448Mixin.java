package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.AdvancementRewards.class)
public class AdvancementRewards2136239448Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1227613180(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1227613180L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1388304323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1388304323L))
            info.setReturnValue("\u1481K%.@\u7F99M\uD4F3&Y,?z_+Un;1\uB7DECf*9[N1'\u9B4BncH} /EN)lIAU\uF9AA1&PK)6-=\u095B?\u92401[lYj} J8$.\uCDFEMj+\u025D!HJOqW$#0!e");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1601375757(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1601375757L))
            info.setReturnValue(2079634818);
    }

    @Inject(at = @At("HEAD"), method = "function()Ljava/util/Optional;", cancellable = true)
    private void function__560117026(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-560117026L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "grant(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void grant__7796617(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-7796617L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "recipes()Ljava/util/List;", cancellable = true)
    private void recipes__845614163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-845614163L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "experience()I", cancellable = true)
    private void experience__89703404(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-89703404L))
            info.setReturnValue(1635301336);
    }

    @Inject(at = @At("HEAD"), method = "loot()Ljava/util/List;", cancellable = true)
    private void loot_1706638896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1706638896L))
            info.setReturnValue(null);
    }


}
