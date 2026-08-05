package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.SeededContainerLoot.class)
public class SeededContainerLoot1820743291Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_912117023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(912117023L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1703800480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1703800480L))
            info.setReturnValue("i,}\uD2A9M,,+z\u86A1QU+,Cj#!</\u434D\u3B628E\uC303{<B\u8D030Y\"\u643F:uq&4I{%l5");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1916871914(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1916871914L))
            info.setReturnValue(1510581304);
    }

    @Inject(at = @At("HEAD"), method = "seed()J", cancellable = true)
    private void seed__1898135471(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1898135471L))
            info.setReturnValue(5644890680222142335L);
    }

    @Inject(at = @At("HEAD"), method = "lootTable()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void lootTable_1515552870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1515552870L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addToTooltip(Lnet/minecraft/world/item/Item$TooltipContext;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;Lnet/minecraft/core/component/DataComponentGetter;)V", cancellable = true)
    private void addToTooltip__554476756(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-554476756L))
            info.cancel();
    }


}
