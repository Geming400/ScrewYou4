package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.player.StackedContents.class)
public class StackedContents_2091745485Mixin {
        @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_2130020223(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2130020223L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "account(Ljava/lang/Object;I)V", cancellable = true)
    private void account_2120218076(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2120218076L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getResultUpperBound(Ljava/util/List;)I", cancellable = true)
    private void getResultUpperBound_1312514403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1312514403L))
            info.setReturnValue(1111344399);
    }

    @Inject(at = @At("HEAD"), method = "tryPick(Ljava/util/List;ILnet/minecraft/world/entity/player/StackedContents$Output;)Z", cancellable = true)
    private void tryPick_1053471715(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1053471715L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "tryPickAll(Ljava/util/List;ILnet/minecraft/world/entity/player/StackedContents$Output;)I", cancellable = true)
    private void tryPickAll_1053455378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1053455378L))
            info.setReturnValue(1805654058);
    }


}
