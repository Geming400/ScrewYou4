package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.SeededContainerLoot.class)
public class SeededContainerLoot1820743291Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1088711746(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1088711746L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_685283316(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(685283316L))
            info.setReturnValue("<7b#\"rpmQs$8{e7;^mH椵y*i`:Uv^8rK5}섴ub?2du꓿ &");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1859006033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1859006033L))
            info.setReturnValue(-981170435);
    }

    @Inject(at = @At("HEAD"), method = "seed()J", cancellable = true)
    private void seed_1859006498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1859006498L))
            info.setReturnValue(-2005124154607550098L);
    }

    @Inject(at = @At("HEAD"), method = "lootTable()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void lootTable__1665732692(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1665732692L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addToTooltip(Lnet/minecraft/world/item/Item$TooltipContext;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;Lnet/minecraft/core/component/DataComponentGetter;)V", cancellable = true)
    private void addToTooltip__721975099(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-721975099L))
            info.cancel();
    }


}
