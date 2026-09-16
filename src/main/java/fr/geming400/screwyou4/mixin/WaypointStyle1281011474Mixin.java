package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.WaypointStyle.class)
public class WaypointStyle1281011474Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_372385206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(372385206L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2051434999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2051434999L))
            info.setReturnValue("E5K,\u5066jdQfUZVN9A!q[\u7678Rn");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1838363565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1838363565L))
            info.setReturnValue(-1343682584);
    }

    @Inject(at = @At("HEAD"), method = "validate()Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void validate_1142504107(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1142504107L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nearDistance()I", cancellable = true)
    private void nearDistance__1613540645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1613540645L))
            info.setReturnValue(-848518221);
    }

    @Inject(at = @At("HEAD"), method = "farDistance()I", cancellable = true)
    private void farDistance__664286132(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-664286132L))
            info.setReturnValue(890206454);
    }

    @Inject(at = @At("HEAD"), method = "spriteLocations()Ljava/util/List;", cancellable = true)
    private void spriteLocations__1304078117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1304078117L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sprite(F)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void sprite_1855226750(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1855226750L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sprites()Ljava/util/List;", cancellable = true)
    private void sprites__807288688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-807288688L))
            info.setReturnValue(null);
    }


}
