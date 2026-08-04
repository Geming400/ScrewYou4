package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.searchtree.IdSearchTree.class)
public class IdSearchTree_964027935Mixin {
        @Inject(at = @At("HEAD"), method = "search(Ljava/lang/String;)Ljava/util/List;", cancellable = true)
    private void search_268788484(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(268788484L))
            info.setReturnValue(null);
    }


}
