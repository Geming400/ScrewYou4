package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.AdvancementRewards.class)
public class AdvancementRewards2136239448Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__773215589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-773215589L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1000779473(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1000779473L))
            info.setReturnValue("\u03FE|p$&M\u704F}}xod0c`GTToqQFnS c]\u2A9BN\uFD34\u239C\u946FNBm`:8\u346AXGi,^S\u891Ba+Uh*:r@s#$Wij} qRS\uCEDF\"\"");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2120465106(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2120465106L))
            info.setReturnValue(-613604665);
    }

    @Inject(at = @At("HEAD"), method = "function()Ljava/util/Optional;", cancellable = true)
    private void function__1913266426(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1913266426L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "grant(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void grant_1366677595(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1366677595L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "recipes()Ljava/util/List;", cancellable = true)
    private void recipes__532391032(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-532391032L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "experience()I", cancellable = true)
    private void experience__2120465602(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2120465602L))
            info.setReturnValue(-410457246);
    }

    @Inject(at = @At("HEAD"), method = "loot()Ljava/util/List;", cancellable = true)
    private void loot__532391032(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-532391032L))
            info.setReturnValue(null);
    }


}
