package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.attributes.Attribute.Sentiment.class)
public class Sentiment1610833841Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/ai/attributes/Attribute$Sentiment;", cancellable = true)
    private static void values_959342709(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(959342709L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/ai/attributes/Attribute$Sentiment;", cancellable = true)
    private static void valueOf_114055730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(114055730L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStyle(Z)Lnet/minecraft/ChatFormatting;", cancellable = true)
    private void getStyle__52839004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-52839004L))
            info.setReturnValue(null);
    }


}
