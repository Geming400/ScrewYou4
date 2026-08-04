package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.CommandBlockEntity.class)
public class CommandBlockEntity1586642171Mixin {
        @Inject(at = @At("HEAD"), method = "isAutomatic()Z", cancellable = true)
    private void isAutomatic_1624920754(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1624920754L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMode()Lnet/minecraft/world/level/block/entity/CommandBlockEntity$Mode;", cancellable = true)
    private void getMode__752031147(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-752031147L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onModeSwitch()V", cancellable = true)
    private void onModeSwitch_1624916910(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1624916910L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setAutomatic(Z)V", cancellable = true)
    private void setAutomatic__1478708296(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1478708296L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeComponentsFromTag(Lnet/minecraft/world/level/storage/ValueOutput;)V", cancellable = true)
    private void removeComponentsFromTag_367510819(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(367510819L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isPowered()Z", cancellable = true)
    private void isPowered_1624920754(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1624920754L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCommandBlock()Lnet/minecraft/world/level/BaseCommandBlock;", cancellable = true)
    private void getCommandBlock_693275994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(693275994L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isConditional()Z", cancellable = true)
    private void isConditional_1624920754(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1624920754L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "markConditionMet()Z", cancellable = true)
    private void markConditionMet_1624920754(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1624920754L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "wasConditionMet()Z", cancellable = true)
    private void wasConditionMet_1624920754(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1624920754L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setPowered(Z)V", cancellable = true)
    private void setPowered__1478708296(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1478708296L))
            info.cancel();
    }


}
