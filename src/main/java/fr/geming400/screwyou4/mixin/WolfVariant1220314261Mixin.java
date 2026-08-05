package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.wolf.WolfVariant.class)
public class WolfVariant1220314261Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1689140776(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1689140776L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_84854286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(84854286L))
            info.setReturnValue("dO$6wAAZc\"I\uB410A:'\u8DA2/t/v&%4V{ODI;x:*");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1258577003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1258577003L))
            info.setReturnValue(-958924540);
    }

    @Inject(at = @At("HEAD"), method = "spawnConditions()Lnet/minecraft/world/entity/variant/SpawnPrioritySelectors;", cancellable = true)
    private void spawnConditions_313652415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(313652415L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "adultInfo()Lnet/minecraft/world/entity/animal/wolf/WolfVariant$AssetInfo;", cancellable = true)
    private void adultInfo__74260645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-74260645L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "babyInfo()Lnet/minecraft/world/entity/animal/wolf/WolfVariant$AssetInfo;", cancellable = true)
    private void babyInfo__74260645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-74260645L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "selectors()Ljava/util/List;", cancellable = true)
    private void selectors__1448316219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1448316219L))
            info.setReturnValue(null);
    }


}
