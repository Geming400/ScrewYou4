package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.SignText.class)
public class SignText_1783739328Mixin {
        @Inject(at = @At("HEAD"), method = "getMessage(IZ)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getMessage_787357761(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(787357761L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setColor(Lnet/minecraft/world/item/DyeColor;)Lnet/minecraft/world/level/block/entity/SignText;", cancellable = true)
    private void setColor__896911548(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-896911548L))
            info.setReturnValue(new net.minecraft.world.level.block.entity.SignText());
    }

    @Inject(at = @At("HEAD"), method = "setMessage(ILnet/minecraft/network/chat/Component;Lnet/minecraft/network/chat/Component;)Lnet/minecraft/world/level/block/entity/SignText;", cancellable = true)
    private void setMessage__1235189684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1235189684L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setMessage(ILnet/minecraft/network/chat/Component;)Lnet/minecraft/world/level/block/entity/SignText;", cancellable = true)
    private void setMessage_218902776(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(218902776L))
            info.setReturnValue(new net.minecraft.world.level.block.entity.SignText());
    }

    @Inject(at = @At("HEAD"), method = "getRenderMessages(ZLjava/util/function/Function;)[Lnet/minecraft/util/FormattedCharSequence;", cancellable = true)
    private void getRenderMessages_938836330(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(938836330L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setHasGlowingText(Z)Lnet/minecraft/world/level/block/entity/SignText;", cancellable = true)
    private void setHasGlowingText_826035253(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(826035253L))
            info.setReturnValue(new net.minecraft.world.level.block.entity.SignText());
    }

    @Inject(at = @At("HEAD"), method = "hasMessage(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void hasMessage__1570622479(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1570622479L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getColor()Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private void getColor__1075919739(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1075919739L))
            info.setReturnValue(net.minecraft.world.item.DyeColor.BLUE);
    }

    @Inject(at = @At("HEAD"), method = "hasAnyClickCommands(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void hasAnyClickCommands__1570622479(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1570622479L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getMessages(Z)[Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getMessages_1966061141(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1966061141L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasGlowingText()Z", cancellable = true)
    private void hasGlowingText_1822017910(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1822017910L))
            info.setReturnValue(false);
    }


}
