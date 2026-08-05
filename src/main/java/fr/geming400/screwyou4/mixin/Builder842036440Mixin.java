package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.CsvOutput.Builder.class)
public class Builder842036440Mixin {
        @Inject(at = @At("HEAD"), method = "build(Ljava/io/Writer;)Lnet/minecraft/util/CsvOutput;", cancellable = true)
    private void build__627768762(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-627768762L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addColumn(Ljava/lang/String;)Lnet/minecraft/util/CsvOutput$Builder;", cancellable = true)
    private void addColumn__1518358130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1518358130L))
            info.setReturnValue(new net.minecraft.util.CsvOutput.Builder());
    }


}
