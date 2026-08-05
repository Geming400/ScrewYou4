package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.PalettedContainerRO.PackedData.class)
public class PackedData980801549Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_72175281(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(72175281L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1751225074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1751225074L))
            info.setReturnValue("\u6116w0IjY\u518A*:Cb)'$0BM\u9A86\u70BA}B{i\u66F7%')r*");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1538153640(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1538153640L))
            info.setReturnValue(1657243558);
    }

    @Inject(at = @At("HEAD"), method = "storage()Ljava/util/Optional;", cancellable = true)
    private void storage__1076458698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1076458698L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "paletteEntries()Ljava/util/List;", cancellable = true)
    private void paletteEntries_1271234386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1271234386L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bitsPerEntry()I", cancellable = true)
    private void bitsPerEntry__1396535720(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1396535720L))
            info.setReturnValue(-1748555503);
    }


}
