package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.AdventureModePredicate.class)
public class AdventureModePredicate1600466448Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_691839684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(691839684L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1924077819(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1924077819L))
            info.setReturnValue("7'bDl@g:wd['2rK:)m.|Gs==5Yh");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2137149253(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2137149253L))
            info.setReturnValue(392288574);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/block/state/pattern/BlockInWorld;)Z", cancellable = true)
    private void test__1524729527(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1524729527L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "addToTooltip(Ljava/util/function/Consumer;)V", cancellable = true)
    private void addToTooltip_2103805460(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2103805460L))
            info.cancel();
    }


}
