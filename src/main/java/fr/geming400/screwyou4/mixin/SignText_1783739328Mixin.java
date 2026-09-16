package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.SignText.class)
public class SignText_1783739328Mixin {
        @Inject(at = @At("HEAD"), method = "getMessage(IZ)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getMessage__1145526638(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1145526638L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setColor(Lnet/minecraft/world/item/DyeColor;)Lnet/minecraft/world/level/block/entity/SignText;", cancellable = true)
    private void setColor_168660069(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(168660069L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setMessage(ILnet/minecraft/network/chat/Component;)Lnet/minecraft/world/level/block/entity/SignText;", cancellable = true)
    private void setMessage_1667639485(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1667639485L))
            info.setReturnValue(new net.minecraft.world.level.block.entity.SignText());
    }

    @Inject(at = @At("HEAD"), method = "setMessage(ILnet/minecraft/network/chat/Component;Lnet/minecraft/network/chat/Component;)Lnet/minecraft/world/level/block/entity/SignText;", cancellable = true)
    private void setMessage_508001361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(508001361L))
            info.setReturnValue(new net.minecraft.world.level.block.entity.SignText());
    }

    @Inject(at = @At("HEAD"), method = "getColor()Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private void getColor__1883236808(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1883236808L))
            info.setReturnValue(net.minecraft.world.item.DyeColor.PINK);
    }

    @Inject(at = @At("HEAD"), method = "getMessages(Z)[Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getMessages__135439849(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-135439849L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasAnyClickCommands(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void hasAnyClickCommands_606822355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(606822355L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setHasGlowingText(Z)Lnet/minecraft/world/level/block/entity/SignText;", cancellable = true)
    private void setHasGlowingText__1994368833(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1994368833L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasMessage(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void hasMessage__1647499196(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1647499196L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getRenderMessages(ZLjava/util/function/Function;)[Lnet/minecraft/util/FormattedCharSequence;", cancellable = true)
    private void getRenderMessages_400373362(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(400373362L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasGlowingText()Z", cancellable = true)
    private void hasGlowingText__1755976850(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1755976850L))
            info.setReturnValue(true);
    }


}
