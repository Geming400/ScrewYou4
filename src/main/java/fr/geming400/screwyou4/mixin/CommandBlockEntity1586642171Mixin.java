package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.CommandBlockEntity.class)
public class CommandBlockEntity1586642171Mixin {
        @Inject(at = @At("HEAD"), method = "isAutomatic()Z", cancellable = true)
    private void isAutomatic_1219709745(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1219709745L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getMode()Lnet/minecraft/world/level/block/entity/CommandBlockEntity$Mode;", cancellable = true)
    private void getMode_1534431214(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1534431214L))
            info.setReturnValue(net.minecraft.world.level.block.entity.CommandBlockEntity.Mode.REDSTONE);
    }

    @Inject(at = @At("HEAD"), method = "onModeSwitch()V", cancellable = true)
    private void onModeSwitch_1317099384(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1317099384L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setPowered(Z)V", cancellable = true)
    private void setPowered__353082406(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-353082406L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isPowered()Z", cancellable = true)
    private void isPowered__113345768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-113345768L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "removeComponentsFromTag(Lnet/minecraft/world/level/storage/ValueOutput;)V", cancellable = true)
    private void removeComponentsFromTag_1473813913(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1473813913L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCommandBlock()Lnet/minecraft/world/level/BaseCommandBlock;", cancellable = true)
    private void getCommandBlock__1404101678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1404101678L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isConditional()Z", cancellable = true)
    private void isConditional__161704650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-161704650L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setAutomatic(Z)V", cancellable = true)
    private void setAutomatic__1483356959(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1483356959L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "markConditionMet()Z", cancellable = true)
    private void markConditionMet__376403644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-376403644L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "wasConditionMet()Z", cancellable = true)
    private void wasConditionMet__258539352(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-258539352L))
            info.setReturnValue(true);
    }


}
