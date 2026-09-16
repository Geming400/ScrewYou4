package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.player.StackedContents.class)
public class StackedContents_2091745485Mixin {
        @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_1305917778(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1305917778L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "account(Ljava/lang/Object;I)V", cancellable = true)
    private void account__181204727(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-181204727L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getResultUpperBound(Ljava/util/List;)I", cancellable = true)
    private void getResultUpperBound_405052244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(405052244L))
            info.setReturnValue(-244156450);
    }

    @Inject(at = @At("HEAD"), method = "tryPick(Ljava/util/List;ILnet/minecraft/world/entity/player/StackedContents$Output;)Z", cancellable = true)
    private void tryPick_1467661407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1467661407L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "tryPickAll(Ljava/util/List;ILnet/minecraft/world/entity/player/StackedContents$Output;)I", cancellable = true)
    private void tryPickAll_410067351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(410067351L))
            info.setReturnValue(914706116);
    }


}
