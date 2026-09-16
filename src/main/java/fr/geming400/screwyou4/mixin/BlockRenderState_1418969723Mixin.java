package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.Display.BlockDisplay.BlockRenderState.class)
public class BlockRenderState_1418969723Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_510343454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(510343454L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2105574049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2105574049L))
            info.setReturnValue("@d,bz{`q|@arl8S^\uBD00E\u8103-(\u2710ZYa{['G\u6460BP\u7DE9YX'\u9DE2");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1976321813(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1976321813L))
            info.setReturnValue(2013940274);
    }

    @Inject(at = @At("HEAD"), method = "blockState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void blockState_837580652(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(837580652L))
            info.setReturnValue(null);
    }


}
