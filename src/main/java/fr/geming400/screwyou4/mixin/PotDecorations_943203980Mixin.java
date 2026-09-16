package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.PotDecorations.class)
public class PotDecorations_943203980Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_34577711(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(34577711L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1713627504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1713627504L))
            info.setReturnValue("3z- H+?IUP\uA79A#BB[P-TyA`:\uCC5EpD5xNyd20h`e\u00F4qfe,u(");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1500556070(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1500556070L))
            info.setReturnValue(293117846);
    }

    @Inject(at = @At("HEAD"), method = "left()Ljava/util/Optional;", cancellable = true)
    private void left_511595328(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(511595328L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "right()Ljava/util/Optional;", cancellable = true)
    private void right_670287445(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(670287445L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "front()Ljava/util/Optional;", cancellable = true)
    private void front__2060530846(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2060530846L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "back()Ljava/util/Optional;", cancellable = true)
    private void back_634460192(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(634460192L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ordered()Ljava/util/List;", cancellable = true)
    private void ordered_1579783336(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1579783336L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addToTooltip(Lnet/minecraft/world/item/Item$TooltipContext;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;Lnet/minecraft/core/component/DataComponentGetter;)V", cancellable = true)
    private void addToTooltip__1432016068(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1432016068L))
            info.cancel();
    }


}
