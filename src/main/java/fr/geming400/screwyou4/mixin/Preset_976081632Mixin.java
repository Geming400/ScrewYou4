package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.biome.MultiNoiseBiomeSourceParameterList.Preset.class)
public class Preset_976081632Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1933373406(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1933373406L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__159378344(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-159378344L))
            info.setReturnValue("R?먶8{:9,ĥ◴관 8A\";)d@[7zS3ᠧL@=aQoPḡl|^nD#1{5따[O.m䗽t6矓Ź䌽v芜5ulM-꾈vXqz諳<O*hQ):");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1014344373(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1014344373L))
            info.setReturnValue(-1103662601);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void id__1466984922(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1466984922L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "provider()Lnet/minecraft/world/level/biome/MultiNoiseBiomeSourceParameterList$Preset$SourceProvider;", cancellable = true)
    private void provider_514851624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(514851624L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "usedBiomes()Ljava/util/stream/Stream;", cancellable = true)
    private void usedBiomes_765375316(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(765375316L))
            info.setReturnValue(null);
    }


}
