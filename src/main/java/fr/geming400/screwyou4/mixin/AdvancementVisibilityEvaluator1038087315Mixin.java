package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.advancements.AdvancementVisibilityEvaluator.class)
public class AdvancementVisibilityEvaluator1038087315Mixin {
        @Inject(at = @At("HEAD"), method = "evaluateVisibility(Lnet/minecraft/advancements/AdvancementNode;Ljava/util/function/Predicate;Lnet/minecraft/server/advancements/AdvancementVisibilityEvaluator$Output;)V", cancellable = true)
    private static void evaluateVisibility__721066504(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-721066504L))
            info.cancel();
    }


}
