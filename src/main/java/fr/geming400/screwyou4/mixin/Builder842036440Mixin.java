package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.CsvOutput.Builder.class)
public class Builder842036440Mixin {
        @Inject(at = @At("HEAD"), method = "build(Ljava/io/Writer;)Lnet/minecraft/util/CsvOutput;", cancellable = true)
    private void build_1928328024(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1928328024L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addColumn(Ljava/lang/String;)Lnet/minecraft/util/CsvOutput$Builder;", cancellable = true)
    private void addColumn__470668617(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-470668617L))
            info.setReturnValue(null);
    }


}
