package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.TemplateFeatureConfiguration.TemplateEntry.class)
public class TemplateEntry873140886Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2036314151(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2036314151L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__262319089(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-262319089L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_911403628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(911403628L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/world/level/levelgen/feature/configurations/TemplateFeatureConfiguration$TemplateEntry;", cancellable = true)
    private static void of_1079012276(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1079012276L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "template()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void template__1569925667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1569925667L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotations()Ljava/util/List;", cancellable = true)
    private void rotations__1795489594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1795489594L))
            info.setReturnValue(null);
    }


}
