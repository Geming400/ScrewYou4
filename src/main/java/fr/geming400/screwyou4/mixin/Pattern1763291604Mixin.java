package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.fish.TropicalFish.Pattern.class)
public class Pattern1763291604Mixin {
        @Inject(at = @At("HEAD"), method = "base()Lnet/minecraft/world/entity/animal/fish/TropicalFish$Base;", cancellable = true)
    private void base_965063144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(965063144L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/animal/fish/TropicalFish$Pattern;", cancellable = true)
    private static void values_1005199248(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1005199248L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/animal/fish/TropicalFish$Pattern;", cancellable = true)
    private static void valueOf_1947763251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1947763251L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "displayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void displayName__413617561(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-413617561L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_627831133(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(627831133L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "byId(I)Lnet/minecraft/world/entity/animal/fish/TropicalFish$Pattern;", cancellable = true)
    private static void byId_1155948066(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1155948066L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPackedId()I", cancellable = true)
    private void getPackedId_1801553850(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1801553850L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addToTooltip(Lnet/minecraft/world/item/Item$TooltipContext;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;Lnet/minecraft/core/component/DataComponentGetter;)V", cancellable = true)
    private void addToTooltip__779426786(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-779426786L))
            info.cancel();
    }


}
