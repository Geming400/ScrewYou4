package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.biome.MultiNoiseBiomeSourceParameterList.Preset.class)
public class Preset_976081632Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_67455363(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(67455363L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1746505156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1746505156L))
            info.setReturnValue("eOU.%{L5\uFACC?FHw}]\uBE45Or1T;;.<>Ztx bM#$$q5c\u20DBdb@?i$");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1533433722(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1533433722L))
            info.setReturnValue(-197126200);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void id__1616696255(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1616696255L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "provider()Lnet/minecraft/world/level/biome/MultiNoiseBiomeSourceParameterList$Preset$SourceProvider;", cancellable = true)
    private void provider_1983366489(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1983366489L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "usedBiomes()Ljava/util/stream/Stream;", cancellable = true)
    private void usedBiomes__1652869276(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1652869276L))
            info.setReturnValue(null);
    }


}
