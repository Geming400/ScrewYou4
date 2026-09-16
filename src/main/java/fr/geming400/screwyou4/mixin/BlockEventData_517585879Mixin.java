package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.BlockEventData.class)
public class BlockEventData_517585879Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__391040390(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-391040390L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1288009403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1288009403L))
            info.setReturnValue("4G?-z94y5R&Bl");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1074937969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1074937969L))
            info.setReturnValue(-1236561471);
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void pos__1763190397(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1763190397L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "block()Lnet/minecraft/world/level/block/Block;", cancellable = true)
    private void block_1352830558(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1352830558L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "paramA()I", cancellable = true)
    private void paramA_750865640(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(750865640L))
            info.setReturnValue(-1939646071);
    }

    @Inject(at = @At("HEAD"), method = "paramB()I", cancellable = true)
    private void paramB_779494791(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(779494791L))
            info.setReturnValue(847950313);
    }


}
