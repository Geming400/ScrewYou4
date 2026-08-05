package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.attributes.Attribute.Sentiment.class)
public class Sentiment1610833841Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/ai/attributes/Attribute$Sentiment;", cancellable = true)
    private static void values__1500827629(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1500827629L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/ai/attributes/Attribute$Sentiment;", cancellable = true)
    private static void valueOf_869529946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(869529946L))
            info.setReturnValue(net.minecraft.world.entity.ai.attributes.Attribute.Sentiment.NEUTRAL);
    }

    @Inject(at = @At("HEAD"), method = "getStyle(Z)Lnet/minecraft/ChatFormatting;", cancellable = true)
    private void getStyle_1486774217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1486774217L))
            info.setReturnValue(net.minecraft.ChatFormatting.GRAY);
    }


}
