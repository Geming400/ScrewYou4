package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.main.GameConfig.FolderData.class)
public class FolderData978703298Mixin {
        @Inject(at = @At("HEAD"), method = "getExternalAssetSource()Ljava/nio/file/Path;", cancellable = true)
    private void getExternalAssetSource__115531574(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-115531574L))
            info.setReturnValue(null);
    }


}
